package com.monkys.tower.app.model;

import java.time.*;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "first_name", length = 50, nullable = false)
	private String firstName;
	@Column(name = "last_name", length = 50, nullable = false)
	private String lastName;
	@Column(name = "email", length = 100, nullable = false, unique = true)
	private String email;
	@Column(name = "password", length = 255, nullable = false)
	private String password;
	@Column(name = "phone_number", length = 20, nullable = true)
	private String phoneNumber;
	@Column(name = "birth_date", nullable = true)
	private LocalDate birthDate;
	@Column(name = "avatar_url", length = 255, nullable = true)
	private String avatarUrl;
	@Column(name = "is_active", nullable = false)
	private boolean active = true;
	
	
    // Hibernate asignará la fecha y hora de creación automáticamente
    // updatable/insertable : el campo no debe ser modificado manualmente
    //                    desde el código, dejando que Hibernate la gestione.
    @CreationTimestamp
	@Column(name = "created_at", nullable = false, updatable = false)
	private LocalDateTime createdAt;
	@Column(name = "updated_at", nullable = false)
	private LocalDateTime updatedAt;
	
	/**
     * Define una relación muchos a muchos entre la entidad 
     * User y la entidad Role.
     * Un cliente puede tener múltiples roles y un rol puede 
     * pertenecer a múltiples clientes.
     * 
     * La relación se gestiona mediante una tabla intermedia 
     * llamada "user_has_role".
     * - La columna "user_id" en la tabla intermedia 
     *   referencia a la entidad User.
     * - La columna "role_id" en la tabla intermedia 
     *   referencia a la entidad Role.
     *   
     *   FetchType.EAGER (Ansiosa)
     *    Se carga inmediatamente, junto con la entidad principal.
     *    Por default está configurado para: toOne
     *   FetchType.LAZY (Perezosa)
     *    Se carga solo cuando se accede a la relación por primera vez.
     *    Carga los roles SÓLO si se llama a user.getRoles()
     * *    
     * LazyInitializationException: Ocurre cuando intentas acceder a una relación 
	 * de una entidad que ha sido configurada con carga perezosa (lazy loading), 
	 * pero la sesión de Hibernate o el contexto de persistencia ya está cerrado.
	 * 
	 * Esto es muy común cuando el método @Transactional está siendo llamado 
	 * desde fuera del proxy de Spring.
	 * 
	 * Asegúrate de acceder a la colección o entidad lazy mientras la sesión de 
	 * Hibernate sigue abierta (es decir, dentro del método @Transactional).
     *    
     * @ManyToMany: Define una relación de muchos a muchos. Un usuario puede tener muchos roles y viceversa.
     * fetch = FetchType.LAZY: Los roles no se cargarán hasta que se accedan explícitamente.
     *   * @JoinTable: Define la tabla intermedia que une 'users' y 'roles'.
     * - name = "users_has_roles": El nombre de la tabla de unión.
     * - joinColumns: La clave foránea que referencia a la entidad actual (User).
     * - inverseJoinColumns: La clave foránea que referencia a la otra entidad (Role).
     */
	
	@ManyToMany (fetch = FetchType.EAGER)// @OneToOne, @OneToMany, @ManyToOne private User user
	
	//JsonIgnoreProperties({field1, field2});
	@JoinTable( 
			name="user_has_role", 
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id")			
			)
	
	private Set<Role> roles = new HashSet<>();
	
	public User() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", birthDate=");
		builder.append(birthDate);
		builder.append(", avatarUrl=");
		builder.append(avatarUrl);
		builder.append(", active=");
		builder.append(active);
		builder.append(", createdAt=");
		builder.append(createdAt);
		builder.append(", updatedAt=");
		builder.append(updatedAt);
		builder.append(", getId()=");
		builder.append(getId());
		builder.append(", getFirstName()=");
		builder.append(getFirstName());
		builder.append(", getLastName()=");
		builder.append(getLastName());
		builder.append(", getEmail()=");
		builder.append(getEmail());
		builder.append(", getPassword()=");
		builder.append(getPassword());
		builder.append(", getPhoneNumber()=");
		builder.append(getPhoneNumber());
		builder.append(", getBirthDate()=");
		builder.append(getBirthDate());
		builder.append(", getAvatarUrl()=");
		builder.append(getAvatarUrl());
		builder.append(", isActive()=");
		builder.append(isActive());
		builder.append(", getCreatedAt()=");
		builder.append(getCreatedAt());
		builder.append(", getUpdatedAt()=");
		builder.append(getUpdatedAt());
		builder.append(", getRoles()=");
		builder.append(getRoles());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}




	

}