package test.huawei_machine_test;

import main.huawei_machine_test.MinimumAbsolute;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class MinimumAbsoluteTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        MinimumAbsolute.solution(line);
    }
}