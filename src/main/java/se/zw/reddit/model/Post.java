package se.zw.reddit.model;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.lang.Nullable;
import javax.persistence.*;
import java.time.Instant;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @NotBlank(message = "Post name can not be empty or null!")
    private String postName;

    @Nullable
    private String url;

    @Nullable
    @Lob
    private String description;

    private Integer voteCount;

    @ManyToOne(fetch = FetchType.LAZY)  // Many posts -> one user
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;

    private Instant createdDate;

    @ManyToOne(fetch = FetchType.LAZY)  // Many posts -> one subreddit
    @JoinColumn(name="id", referencedColumnName = "id")
    private Subreddit subreddit;
}
