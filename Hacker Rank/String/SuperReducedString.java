class Result {

    public static String superReducedString(String s) {
    // Write your code here
    StringBuilder sb = new StringBuilder(s);
    for(int i = 1; i < sb.length(); i++){
        if(sb.charAt(i) == sb.charAt(i-1)){
            sb.delete(i-1, i+1);
            i = 0;
        }
    }
    String answer = sb.toString();
    if(answer.length() == 0){
        return "Empty String";
    }
    else {
        return answer;
    }

    }

}
