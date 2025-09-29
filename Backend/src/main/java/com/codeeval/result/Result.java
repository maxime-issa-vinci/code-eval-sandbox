package com.codeeval.result;

import com.codeeval.submission.Submission;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "submission_id", nullable = false)
    private Submission submissionId;
    @Column(name = "stdout")
    private String stdout;
    @Column(name = "stderr")
    private String stderr;
    @Column(name = "exit_code")
    private int exitCode;
    @Column(name = "execution_time_ms")
    private Long executionTimeMs;
    @Column(name = "score")
    private Double score;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
