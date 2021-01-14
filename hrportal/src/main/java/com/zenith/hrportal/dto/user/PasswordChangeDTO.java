package com.zenith.hrportal.dto.user;

/**
 * A DTO representing a password change required data - current and new
 * password.
 */
public class PasswordChangeDTO {
	private String currentPassword;
	private String newPassword;

    /**
     * Instantiates a new Password change dto.
     */
    public PasswordChangeDTO() {}

    /**
     * Instantiates a new Password change dto.
     *
     * @param currentPassword the current password
     * @param newPassword     the new password
     */
    public PasswordChangeDTO(String currentPassword, String newPassword) {
		this.currentPassword = currentPassword;
		this.newPassword = newPassword;
	}

    /**
     * Gets current password.
     *
     * @return the current password
     */
    public String getCurrentPassword() {

		return currentPassword;
	}

    /**
     * Sets current password.
     *
     * @param currentPassword the current password
     */
    public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

    /**
     * Gets new password.
     *
     * @return the new password
     */
    public String getNewPassword() {
		return newPassword;
	}

    /**
     * Sets new password.
     *
     * @param newPassword the new password
     */
    public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
}
