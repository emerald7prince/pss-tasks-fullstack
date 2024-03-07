package com.emeraldprince.PssTasks;

import com.emeraldprince.PssTasks.entity.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@JsonTest
public class TaskJsonTest {

    @Autowired
    private JacksonTester<Task> json;

    @Test
    void taskSerializationTest() throws IOException {

//        Task task = new Task(1, 1, "Test task", "Test comment");
//
//        assertThat(json.write(task)).isStrictlyEqualToJson("/taskExample.json");
//        assertThat(json.write(task)).hasJsonPathNumberValue("@.taskId");
//        assertThat(json.write(task)).extractingJsonPathNumberValue("@.taskId").isEqualTo(1);

    }


}
