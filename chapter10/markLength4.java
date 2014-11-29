public void markLength4(ArrayList<String> list) {
	if(list.isEmpty()){
		return;
	}

	String ast = "****";
	String holder = list.get(0);
	int index = 0;
	int length = holder.length();
	
	//if the first element is length 4, add asterisks first. if so, index should jump to 2
	if (length == 4) {
		list.add(0, ast);
		index += 2;
	}
	
	for (; index < list.size(); index++) {
	
		holder = list.get(index);
		length = holder.length();
		
		if (length == 4) {
			list.add(index, ast);
			index++;
		}
	}
}
