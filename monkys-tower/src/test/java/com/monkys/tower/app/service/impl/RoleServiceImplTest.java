package com.monkys.tower.app.service.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.event.ListDataEvent;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.monkys.tower.app.model.Role;
import com.monkys.tower.app.repository.RoleRepository;

/**
 * Verificar la lógica de negocio dentro de RoleServiceImpl de forma aislada.
 * Para lograrlo, "mockearemos" (simularemos) la capa de repositorio
 * (RoleRepository) usando Mockito. Esto significa que las pruebas se ejecutan
 * sin necesidad de una base de datos real y se centran únicamente en el
 * comportamiento del  servicio.
 */
@ExtendWith(MockitoExtension.class) // Habilita el uso de anotaciones de Mockito
@DisplayName("Pruebas unitarias de la capa de servicio de Role (RoleServiceImpl)")
public class RoleServiceImplTest {

	@Mock // Crear mock(simulación) del respositorio
	private RoleRepository roleRepository;
	@InjectMocks // Crear una instancia de RoleServiceImpl e inyecta los mocks(roleRepository)
	private RoleServiceImpl roleService;
	
	private Role adminRole;
	private Role customerRole;
	
	@BeforeEach
	void setUp() {
		// Preparamos algunos datos de prueba reutilizables
		adminRole = new Role(1L, "ADMIN", "Administrador del sistema");
		customerRole = new Role(2L, "CUSTOMER", "Cliente del sistema");
	}
	
	@Test
	@DisplayName("findAll: Debe devolver un iterable de Role")
	void testFindAll() {
		// Arrange: Preparamos el escenario
		Iterable<Role> roles = new ArrayList<>(List.of(adminRole, customerRole));
		
		// Definir el comportamiento del mock
		when( roleRepository.findAll() ).thenReturn( roles );
		
		// Act: Ejecutar el método a probar
		Iterable<Role> result = roleService.findAll();
		List<Role> listRoles = (List<Role>)result;
		
		// Assert: Verificar el resultado
		assertNotNull( result );
		assertEquals( 2, listRoles.size());
		assertEquals( "ADMIN", listRoles.get(0).getName() );
		assertTrue( listRoles.contains( customerRole ) );
		// Verificar que el método findAll es llamado una sola vez.
		verify(roleRepository, times(1)).findAll(); 
	}
	
	
	@Test
	@DisplayName("findById: Debe devolver un rol cuando el ID exista")
	void testFindByIdFound() {
		// Arrange
		when( roleRepository.findById(1L) ).thenReturn( Optional.of(adminRole));
		
		// Act
		Role result = roleService.findById(1L);
		
		// Assert
		assertNotNull( result );
		assertEquals("ADMIN", result.getName());
		assertEquals( 1L, result.getId() );
		assertEquals("Administrador del sistema", result.getDescription());
	}
	/**
	@Test
	@DisplayName("findById: Debe lanzar una excepción si el ID no existe")
	void testFindByIdNotFound() {
		// Arrange
		when( roleRepository.findById(1L) ).thenReturn( Optional.empty());
		
		// Act && Assert
		IllegalStateException exception = assertThrows( IllegalStateException.class, ()-> roleService.findById(1L) );
		assertEquals("Role does not exist with id 10", exception.getMessage());
	}
	*/
	@Test
	@DisplayName("save: Debe guardar un nuevo rol, y asignarle un ID")
	void testSave() {
		// Arrange
		Role role = new Role(null, "WHEREHOUSE_MANAGER", "Administrador de alacén");
		Role newRole = new Role(3L, "WHEREHOUSE_MANAGER", "Administrador de alacén");
		// TODO hacer el when del comportamiento de roleRepository.save
		when( roleRepository.save(role)).thenReturn(newRole);
		
		// Act
		Role createdRole = roleService.save(role);
		
		// Assert
		assertEquals(createdRole, newRole);
		assertNotNull(createdRole.getId());
		
		
	}

}