public class SortedWordList extends WordList{

    public SortedWordList(){     
    }
    public void add(Word w){
        WordNode nnode = new WordNode(w);
        WordNode current = first;
        while(current.next != null && current.next.data.data.compareTo(nnode.data.data) < 0){//itterate until find a node greater than w no need to update last
            current = current.next;
        }
        if (current.next==null){
            append(w);
        }
        if(current.next.data.data.compareTo(nnode.data.data) > 0){
            nnode.next = current.next;
            current.next = nnode;
        }
        
        length++;
    }
/*
    public void add(Word w){

        if(first.next == null){//when list is empty OK
            append(w);
            
        }
        else{
        if(first.next.data.data.compareTo(w.data) < 0){//when first.next > word
            //System.out.println(w.data);
            WordNode node = new WordNode(w);//create a new node with w and add it to beggining no need to update last
            //System.out.println(node.data.data);
            node = first.next;
            first.next = node;
            length++;
            
        }

        if(last.data.data.compareTo(w.data) > 0){//if w is greater than last node 
            append(w);//add w to the end
            
        }

        if(current.next.data.data.compareTo(w.data) > 0 && last.data.data.compareTo(w.data) < 0){//if its somewhere in between first and last 
            WordNode nnode = new WordNode(w);
            WordNode current = first;
            while(current.next != null && current.next.data.data.compareTo(nnode.data.data) < 0){//itterate until find a node greater than w no need to update last
                current = current.next;
            }
                nnode.next = current.next;
                current.next = nnode;
                length++;
            
        }

        //System.out.println(first.next.data.data);
        //System.out.println(w.data);
       // Word cat = new Word("Are");
        //Word are = new Word("Ducks");
        //System.out.println(cat.compareTo(are)); //  Ducks Are+  cats Are+   cats Ducks+ so if a < b the number is positive. Are Ducks- if a > b its -
    }
    
    }*/
}
