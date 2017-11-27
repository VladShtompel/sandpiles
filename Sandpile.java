public class Sandpile {
    private int [][] pile;
    private int size;

    public Sandpile(int n)
    {
        this.size = n;
        this.pile = new int[size][size];
        for(int i = 0; i< size;i++)
            for(int j = 0; j< size;j++)
                this.pile[i][j] = 0;
    }

    public Sandpile(Sandpile p)
    {
        this.size = p.size;
        this.pile = new int[size][size];
        for(int i = 0; i< size;i++)
            for(int j = 0; j< size;j++)
                this.pile[i][j] = p.pile[i][j];
    }

    public void addToCenter(int n)
    { pile[(int)Math.ceil(size/2)][(int)Math.ceil(size/2)] += n; }

    public void topple()
    {
        boolean flag = true;
        Sandpile tmp = new Sandpile(this.size);
        int c = 0;
        while (flag)
        {
            flag = false;
            for (int i = 0; i < size; i++)
            {
                for (int j = 0; j < size; j++)
                {
                    while (pile[i][j] > 3)
                    {
                        System.out.println("T# " + c++);
                        flag = true;
                        try
                        {
                            pile[i][j] -= 4;
                            pile[i][j - 1] += 1;
                            pile[i][j + 1] += 1;
                            pile[i - 1][j] += 1;
                            pile[i + 1][j] += 1;
                        } catch (Exception e) {}
                    }
                }
            }
        }
    }

    public int[][] getPile() { return pile; }
}
