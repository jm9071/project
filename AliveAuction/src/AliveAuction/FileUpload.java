 package AliveAuction;

 

import javax.swing.JFileChooser;

import javax.swing.JOptionPane;

 

public class FileUpload {

 

  public static void main(String[] args){
 
   JFileChooser chooser = new JFileChooser(); //객체 생성
 

   int ret = chooser.showOpenDialog(null);  //열기창 정의

 

   if (ret != JFileChooser.APPROVE_OPTION) {

    JOptionPane.showMessageDialog(null, "경로를 선택하지않았습니다.",

      "경고", JOptionPane.WARNING_MESSAGE);

    return;

   }

 

 

   String filePath = chooser.getSelectedFile().getPath();  //파일경로를 가져옴

   System.out.println(filePath);  //출력

  }

 

}

