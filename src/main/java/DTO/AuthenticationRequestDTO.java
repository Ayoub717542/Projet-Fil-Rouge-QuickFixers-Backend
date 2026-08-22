package DTO;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequestDTO {
    @NonNull
    private String userEmail;
    @NonNull
    private String password;
}
