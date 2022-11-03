package msku.ceng.madlab.labweek5;


import android.view.View;


public class CellListener implements View.onClickListener {
    int row,col;

    public CellListener (int row, int col){
        this.row = row;
        this.col = col;
    }

    public void onClick(View v){
        if(player1Turn){
            ((Button)v).setText(PLAYER_1);
            board[row][col] = 1;
        }else{
            ((Button)v).setText(PLAYER_1);
            board[row][col] = 1;

        }
    }

    TableLayout table = finViewById(R.id.board);
    for(int i = 0; i<3; i++){
        TableRow row = (TableRow) table.getChildAt(i);
        for(int j = 0 ; j<3 ; j++){
            Button btn = (Button) row.getChildAt(j);
            btn.setOnClickListener(new CellListener(i,j));
        }
    }

    public boolean isValidMove(int row, int col){
        return false;
    }

    public int gameEnded(int row, int col ){
        return -1;
    }
}
