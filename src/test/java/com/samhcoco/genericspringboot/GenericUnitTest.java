package com.samhcoco.genericspringboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class GenericUnitTest {

    @Test
    public void test() {
        assertThat(true).isTrue();
    }


}
