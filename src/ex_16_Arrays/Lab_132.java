package ex_16_Arrays;

public class Lab_132 {
        public static void main(String[] args) {
            String[] names =  {"pramod","amit","lucky"};
            System.out.println(names[0]);

            String[] names_atb9x = new String[3];
            names_atb9x[0] = "Venkata";
            names_atb9x[1] = "Sai";
            names_atb9x[2] = "Akhil";
            System.out.println(names_atb9x.length);
            System.out.println(names_atb9x[0]);
            System.out.println(names_atb9x[1]);
            System.out.println(names_atb9x[2]);

            boolean[] is_male_data = new boolean[2];
            is_male_data[0] =  true;
            is_male_data[1] =  false;
            System.out.println(is_male_data[1]);
            System.out.println(is_male_data[0]);

        }
    }
