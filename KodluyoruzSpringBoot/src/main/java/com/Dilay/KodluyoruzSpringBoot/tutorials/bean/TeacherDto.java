package com.Dilay.KodluyoruzSpringBoot.tutorials.bean;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class TeacherDto {
    private Long teacherId ;
    @NotEmpty(message = "You can't make name surname blank")
    @Size(min = 1 , max=255)
    private String teacherNameSurname;
    @NotEmpty(message = "You can't make email blank")
    @Email(message = "Please enter valid email")
    private String teacherEmail;
    @NotEmpty(message =" You can't make password blank")
    @Min(value=18 , message = "min 18")
    @Max(value= 100 , message = "Max value 100")
    private String teacherPassword ;


}
