package com.zenith.hrportal.mappers;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.zenith.hrportal.dto.user.UserDTO;
import com.zenith.hrportal.entities.user.Authority;
import com.zenith.hrportal.entities.user.User;

/**
 * Mapper for the entity {@link User} and its DTO called {@link UserDTO}.
 */
@Service
public class UserMapper {

	public List<UserDTO> usersToUserDTOs(List<User> users) {
		return users.stream().filter(Objects::nonNull).map(this::userToUserDTO).collect(Collectors.toList());
	}

	public UserDTO userToUserDTO(User user) {
		return new UserDTO(user);
	}

	public List<User> userDTOsToUsers(List<UserDTO> userDTOs) {
		return userDTOs.stream().filter(Objects::nonNull).map(this::userDTOToUser).collect(Collectors.toList());
	}

	public User userDTOToUser(UserDTO userDTO) {
		if (userDTO == null) {
			return null;
		} else {
			User user = new User();
			user.setId(userDTO.getId());
			user.setLogin(userDTO.getLogin());
			user.setFirstName(userDTO.getFirstName());
			user.setLastName(userDTO.getLastName());
			user.setEmail(userDTO.getEmail());
			user.setActivated(userDTO.isActivated());
			Set<Authority> authorities = this.authoritiesFromStrings(userDTO.getAuthorities());
			user.setAuthorities(authorities);
			return user;
		}
	}

	private Set<Authority> authoritiesFromStrings(Set<String> authoritiesAsString) {
		Set<Authority> authorities = new HashSet<>();

		if (authoritiesAsString != null) {
			authorities = authoritiesAsString.stream().map(string -> {
				Authority auth = new Authority();
				auth.setName(string);
				return auth;
			}).collect(Collectors.toSet());
		}

		return authorities;
	}

	public User userFromId(Long id) {
		if (id == null) {
			return null;
		}
		User user = new User();
		user.setId(id);
		return user;
	}
}
