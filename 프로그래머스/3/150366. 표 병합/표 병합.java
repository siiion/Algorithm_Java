import java.util.*;

class Solution {
    static final int N = 50;    
    static final int SZ = N * N;   

    int[] parent = new int[SZ];
    String[] val = new String[SZ]; 

    public String[] solution(String[] commands) {
        for (int i = 0; i < SZ; i++) {
            parent[i] = i;
            val[i] = ""; 
        }

        List<String> out = new ArrayList<>();

        for (String cmd : commands) {
            String[] tok = cmd.split(" ");
            switch (tok[0]) {
                case "UPDATE":
                    if (tok.length == 4) {
                        int r = Integer.parseInt(tok[1]);
                        int c = Integer.parseInt(tok[2]);
                        String value = tok[3];
                        int id = id(r, c);
                        int root = find(id);
                        val[root] = value;
                    } else {
                        String v1 = tok[1];
                        String v2 = tok[2];
                        for (int i = 0; i < SZ; i++) {
                            if (parent[i] == i && val[i].equals(v1)) {
                                val[i] = v2;
                            }
                        }
                    }
                    break;

                case "MERGE": {
                    int r1 = Integer.parseInt(tok[1]);
                    int c1 = Integer.parseInt(tok[2]);
                    int r2 = Integer.parseInt(tok[3]);
                    int c2 = Integer.parseInt(tok[4]);
                    int a = id(r1, c1);
                    int b = id(r2, c2);
                    if (a == b) break;

                    int ra = find(a);
                    int rb = find(b);
                    if (ra == rb) break;

                    String va = val[ra];
                    String vb = val[rb];

                    parent[rb] = ra;

                    if (!va.isEmpty()) {
                        val[ra] = va;
                    } else if (!vb.isEmpty()) {
                        val[ra] = vb;
                    } else {
                        val[ra] = "";
                    }
                    break;
                }

                case "UNMERGE": {
                    int r = Integer.parseInt(tok[1]);
                    int c = Integer.parseInt(tok[2]);
                    int x = id(r, c);
                    int root = find(x);
                    String keep = val[root]; 
                    
                    List<Integer> members = new ArrayList<>();
                    for (int i = 0; i < SZ; i++) {
                        if (find(i) == root) members.add(i);
                    }
                    
                    for (int cell : members) {
                        parent[cell] = cell;
                        val[cell] = "";
                    }

                    val[x] = keep;
                    break;
                }

                case "PRINT": {
                    int r = Integer.parseInt(tok[1]);
                    int c = Integer.parseInt(tok[2]);
                    int id = id(r, c);
                    int root = find(id);
                    out.add(val[root].isEmpty() ? "EMPTY" : val[root]);
                    break;
                }
            }
        }
        return out.toArray(new String[0]);
    }

    private int id(int r, int c) { 
        return (r - 1) * N + (c - 1);
    }

    private int find(int x) {
        if (parent[x] == x) return x;
        parent[x] = find(parent[x]);
        return parent[x];
    }
}
