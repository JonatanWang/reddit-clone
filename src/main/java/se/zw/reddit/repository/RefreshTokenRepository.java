package se.zw.reddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.zw.reddit.model.RefreshToken;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByToken(String token);

    void deleteByToken(String token);
}