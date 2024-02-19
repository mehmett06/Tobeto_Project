package common.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class BaseEntity {

    @Column(name="CREATED AT")
    private LocalDateTime createdAt;

    @Column(name="CREATED BY")
    private String createdBy;

    @Column(name="UPDATED AT")
    private LocalDateTime updatedAt;

    @Column(name="UPDATED BY")
    private LocalDateTime updatedBy;

    @PrePersist
    private void prePersist(){
        this.createdAt=LocalDateTime.now();
    }
    @PreUpdate

      private void preUpdate(){
      this.updatedAt=LocalDateTime.now();
      }

}
