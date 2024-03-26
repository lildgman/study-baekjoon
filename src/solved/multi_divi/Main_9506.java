    package solved.multi_divi;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayList;

    public class Main_9506 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            ArrayList list = new ArrayList();
            int sum;

            while (true) {
                int n = Integer.parseInt(br.readLine());
                sum = 0;
                sb.setLength(0);
                list.clear();
                if (n == -1) {
                    break;
                }

                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        list.add(i);
                    }
                }

                list.remove(list.size()-1);

                for (int i = 0; i < list.size(); i++) {
                    sum += (int)list.get(i);
                }

                if (n == sum) {
                    sb.append(n);
                    sb.append(" = ");
                    for (int i = 0; i < list.size(); i++) {
                        sb.append(list.get(i));
                        if (i != list.size() - 1) {
                            sb.append(" + ");
                        }
                    }
                } else {
                    sb.append(n);
                    sb.append(" is NOT perfect.");
                }
                System.out.println(sb);
            }
        }
    }
