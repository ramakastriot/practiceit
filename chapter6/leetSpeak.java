/* Write a method leetSpeak that accepts two parameters: a Scanner 
 * representing an input file, and a PrintStream representing an output file. 
 * Your method should convert the input file's text to "leet speak" (aka 1337 
 * speak), an internet dialect where various letters are replaced by other 
 * letters/numbers. Output the leet version of the text to the given output 
 * file. Preserve the original line breaks from the input. Also wrap each word 
 * of input in parentheses. Perform the following replacements:
 *
 *   Original character      'Leet' character
 *       o                               0
 *       l (lowercase L)                 1
 *       e                               3
 *       a                               4
 *       t                               7
 *       s (at the end of a word only)   Z
 */
public void leetSpeak(Scanner input, PrintStream output) {
    while(input.hasNextLine()) {
        String line = input.nextLine();
        
        line = line.replace('o', '0');
        line = line.replace('l', '1');
        line = line.replace('e', '3');
        line = line.replace('a', '4');
        line = line.replace('t', '7');
        
        Scanner lineSc = new Scanner(line);
        
        while(lineSc.hasNext()) {
            String token = lineSc.next();
            
            if(token.charAt(token.length() - 1) == 's')
                token = token.substring(0, token.length() - 1) + 'Z';
            
            output.print("(" + token + ") ");
        }
        
        output.println();
                     
    }
}
