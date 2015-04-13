//add start to frontier
//while frontier not empty, get node from frontier
//Node on frontier will include an x,y coordinate, a getX, and a getY, and a previous node, getPrev, and setPrev

//class frontier is a linkedList of nodes
// make a method to add things to the frontier
//make a method to remove things from frontier
//make a method to test if empty


//in maze class
//make a bf search method, which takes an x,y coordinate
//make a frontier
//add x,y to frontier
//set that location to "x"
//two new variable, tx, ty, set both to 0
//new node variable tmp
//while frontier not empty, current = f.remove(), cx = current.getX, cy = current.getY, current location set to "z"
//if board[tx][ty] = "$" break
//tx = cx +1
//ty = cy
//if board[tx][ty] == "#" || board[tx][ty] == "$"
//tmp = new Node(tx,ty)
//tmp.setPrev current
//f.add tmp

//then repeat last five lines with other combos of tx,ty

//delay
//print (this)
//for node current.prev, p not not, p = p.getPrev (board[pX][pY] = "P")
//delay
//print this
