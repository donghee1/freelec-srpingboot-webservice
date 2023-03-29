package com.tattoo.book.springboot.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){

        //given
        String name = "TATTOO";
        int amount = 5;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);
        //System.out.println("??? = " + dto.toString());

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);

    }

}
