package security;

import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;

@Service
public class JwtService {
    private static  final String SECRET_KEY="DE7D1440A4930996A6822E1FBEC6C3900B7CE1FA251A15AAB5D73C912312D7E8";


    public String extractUsername(String token) {
        return extractClaim(token,Claims::getSubject);
    }

    private Claims extractAllClaims (String token){
        return Jwts.parser()
                .verifyWith(getSignInKey()) // verify the sender of the jwt is who it claims to be and ensure the message does not change at all.
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }









    private SecretKey getSignInKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
