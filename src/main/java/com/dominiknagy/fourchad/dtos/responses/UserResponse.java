package com.dominiknagy.fourchad.dtos.responses;

import com.dominiknagy.fourchad.enums.UserRole;
import lombok.Data;

@Data
public class UserResponse {
    private String nickname;
    private UserRole userRole;
}
