package com.example.Covid.Vaccine.Booking.System.dto.RequestDto;

import com.example.Covid.Vaccine.Booking.System.Enum.Gender;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequestDto {

    String name;

    int age;

    String emailId;

    String mobileNo;

    Gender gender;
}
