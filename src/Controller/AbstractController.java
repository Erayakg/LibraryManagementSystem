package Controller;

import java.util.Objects;

public abstract class AbstractController {
    public  int searchData(String data[][],String search){
        for (int i = 0; i < data.length; ++i) {
            for(int j = 0; j < data[i].length; ++j) {
                if(Objects.equals(data[i][j], search)){
                    return 1;
                }
            }
        }
        return 0;
    }

}
