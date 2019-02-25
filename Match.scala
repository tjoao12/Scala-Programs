def ones(no:Int):String= {

var result= ""
no match {

	case 1=>result="one"
	case 2=>result="two"
	case 3=>result="three"
	case 4=>result="four"
	case 5=>result="five"
	case 6=>result="six"
	case 7=>result="seven"
	case 8=>result="eigth"
	case 9=>result="nine"
	case 10=>result="ten"
	case 11=>result="eleven"
	case 12=>result="twelve"
	case 13=>result="thirteen"
	case 14=>result="fourteen"
	case 15=>result="fifteen"
	case 16=>result="sixteen"
	case 17=>result="seventeen"
	case 18=>result="eighteen"
	case 19=>result="nineteen"
	case _=> result=""
	}
	return result
}
	
	def ty(no:Int):String= {
	
	var result= ""
	no match {
	case 20=>result="twenty"
	case 30=>result="thirty"
	case 40=>result="forty"
	case 50=>result="fifty"
	case 60=>result="sixty"
	case 70=>result="seventy"
	case 80=>result="eighty"
	case 90=>result="ninty"
	case _=> result=""
	}
	return result
}

var answer="" 
var num=10
for (value<- 0  to num) {
println (answer)
} 

if(num>=1000) {
answer+=ones(num/1000)+" thousand "
num=num-(num/1000)*1000

}

if (num>=100) {
	answer+=ones(num/100)+" hundred "
	num=num-(num/100)*100
} 

if(num>=20) {
answer+=ty(num/10*10)+ones(num%10)
}

if(num<=19) {
answer+=ones(num)
}
print(answer)
