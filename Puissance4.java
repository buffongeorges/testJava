package fr.uha.td1.puissance4;

public class Puissance4 {
	
	private Color[][] grid=new Color[7][6];
	
	
	
	private int count;
	private Color lastinsertion;

	public void insert(Color color, int column) {
		// TODO Auto-generated method stub
		if(this.count++ >5 ) {
			throw new IllegalStateException("only 6 lines available");
		}
		if(this.lastinsertion==color) {
			throw new IllegalStateException("last insertion is "+lastinsertion+" : expecting other color"); 
		}
		lastinsertion=color;
		int line = 0;
		while(grid[column][line]!=null) {
			line++;
		}
		grid[column][line]=color;
		
	}

	public Color isFull(int column, int line) {
		// TODO Auto-generated method stub
		
		return grid[column][line];
	}
	public boolean GameIsWin()
	{
		int serie=0;
		int i,j;
		for (i=0;i<=7;i++)
		{
			for (j=0;j<=6;j++)
			{
				if (lastinsertion==grid[i][j])
				{
					serie++;
					lastinsertion=grid[i][j];
				}
				else
				{
					serie=0;
				}
				if (serie==4)
					System.out.println("vous avez gagné");
					return true;
			}
		}
		return false;
		
	}

}
