package com.smanager.dao.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Table(name = "ASSIGNMENTS")
@EntityListeners(AuditingEntityListener.class)
public class Assignment {
    @Column(name = "assignment_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String content;

    private Byte[] attachment;

    @OneToMany(mappedBy = "solution", targetEntity = AssignmentSolution.class)
    private Set<AssignmentSolution> solutions;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    private Student student;

    public Assignment() {}

    public Assignment(String title, String content, Byte[] attachment) {
        this.title = title;
        this.content = content;
        this.attachment = attachment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Byte[] getAttachment() {
        return attachment;
    }

    public void setAttachment(Byte[] attachment) {
        this.attachment = attachment;
    }

    public Set<AssignmentSolution> getSolutions() {
        return solutions;
    }

    public void setSolutions(Set<AssignmentSolution> assignmentSolutions) {
        this.solutions = solutions;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: " + getId() + ", title: " + getTitle() + ", content: " + getContent() + "\n");
        for (AssignmentSolution as : getSolutions()) {
            sb.append(as.toString());
            sb.append("\n");
        }

        return sb.toString();
    }
}
