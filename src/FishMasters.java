import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class FishMasters {
	public static void main(String[] args) {
		Fish myFish = new Fish(20);
		String feetString="";
		int feet;
		BufferedReader stdin = new BufferedReader
				(new InputStreamReader(System.in));
				// ����������� ��������� ��� ���� ������������ �� ������
				// ������� "Q"
				while (true) {
				System.out.println("������ � ����������. �� ����� �������?");
				try {
					feetString = stdin.readLine();
					if (feetString.equals("q")){
					// ����� �� ���������
					System.out.println("����!");
					System.exit(0);
					}else {
					// ����������� feetString � ����� ����� � �����������
					// �� �������, ������� ������������ ���������� feet
					feet = Integer.parseInt(feetString);
					myFish.dive(feet);
					}
					} catch (IOException e) {
					e.printStackTrace();
					}
					} // ����� while
					} // ����� main
					
		}


