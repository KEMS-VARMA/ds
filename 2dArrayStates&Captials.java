package 2darraystates&captials;

public class 2dArrayStates&Captials{

    public static void main(String[] args) {
        String[][] states = new String[5][2];
        states[0][0] = "Telangana";
        states[0][1] = "Heyderabad";
        states[1][0] = "Karnataka";
        states[1][1] = "Bengaluru";
        states[2][0] = "Andhra";
        states[2][1] = "Amravathi";
        states[3][0] = "Tamilnadu";
        states[3][1] = "Chennai";
        states[4][0] = "Kerala";
        states[4][1] = "Thiruvananthapuram";
        for (int i = 0; i < states.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < states[i].length; j++) {
                if (j == 0) {
                    sb.append("The capital of ");
                } else {
                    sb.append(" is ");
                }
                sb.append(states[i][j]);
            }
            System.out.println(sb);
        }
    }
}
