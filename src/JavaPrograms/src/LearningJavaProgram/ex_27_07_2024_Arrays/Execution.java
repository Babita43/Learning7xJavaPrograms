package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Arrays;

import java.util.Arrays;

public class Execution {
    public static void main(String[] list) {

            // TODO Auto-generated method stub
            double salary[] = new double[4];
            salary[0] = 56;
            salary[1] = 86;
            salary[2] = 99;
            salary[3] = 50;
            double min = salary[0];
            for(int i=0; i<salary.length;i++) {
                if(salary[i]<min) {
                    min= salary[i];
                }
            }

            System.out.println(min);
        Arrays.sort(salary);
        System.out.println(salary[salary.length-4]);
        }
    }

