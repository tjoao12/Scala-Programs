import java.sql.{Connection,DriverManager}

class banking{

	Class.forName("com.mysql.cj.jdbc.Driver")
	var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "")
	val statement = connection.createStatement
	
	def checkbalance(Acno:Int):Int={
		var deps=statement.executeQuery("SELECT sum(Amount) as money from deposit where acno="+Acno)
		deps.next()
		var TotalDeposits=deps.getInt("money")
		var draws=statement.executeQuery("SELECT sum(Amount) as money from withdraw where acno="+Acno)
		draws.next()
		var Totalwithdraws=draws.getInt("money")
		var balance=TotalDeposits-Totalwithdraws
		println("your balance is: " + balance)
		return balance	
	}

	def AccountholderInfo(Acno:Int)={
		var record=statement.executeQuery("SELECT * from personal where acno="+Acno)
		if( record.next()){
				println("Account Holder Name:"+record.getString("Name"))
				println("Account Holder Address:"+record.getString("Address"))
				println("Hi "+record.getString("Name")+ " What is the amount of deposit: ")
				val amount = scala.io.StdIn.readInt()
				var Q=s"insert into deposit values(%d,SYSDATE(),%d)".format(amount,Acno)
				statement.executeUpdate(Q)
				println("You have deposited " + amount + " Pound")			
		}
		else{
			println(" Invalid account number")
		}	
	}
	def createAccount()={
				println("What is your name?: ")
				val Name = scala.io.StdIn.readLine()
				println("What is your address?: ")
				val Address = scala.io.StdIn.readLine()
				statement.executeUpdate("INSERT INTO personal Values(null, '"+Name+"', '"+Address+"')")
				println("Congrats, " + Name + " account created! ")
	}

	def deposits(Acno:Int)={
		var record=statement.executeQuery("SELECT * from personal where acno="+Acno)
		if( record.next()){
				println("Account Holder Name:"+record.getString("Name"))
				println("Account Holder Address:"+record.getString("Address"))
				print("Enter the Amount to deposit:")
				val amount = scala.io.StdIn.readInt()
				var Q=s"insert into deposit values(%d,SYSDATE(),%d)".format(amount,Acno)
				statement.executeUpdate(Q)
				println("You have deposited " + amount + " Pounds")
				println("your New Balance is:"+checkbalance(Acno))
		}
		else{
			println(" Invalid account number")
		}	
	}
	def withdraw(Acno:Int)={
		var record=statement.executeQuery("SELECT * from personal where acno="+Acno)
		if( record.next()){
			println("Account Holder Name:"+record.getString("Name"))
			println("Account Holder Address:"+record.getString("Address"))
			println(record.getString("Name")+ " What is the amount of withdraw: ")
			val amount = scala.io.StdIn.readInt()
			var Q=s"insert into withdraw values(%d,SYSDATE(),%d)".format(amount,Acno)
			statement.executeUpdate(Q)
			println("You have withdrawn " + amount + " Pounds")			
		}
		else{
			println(" Invalid account number")
		}
	}
}

var hsbc=new banking()
var option=0
while (option!=5){
	println("----------------------------")
	println("To create account press 1")
	println("To deposit press press 2")
	println("To withdraw press 3")
	println("To check balance press 4")
	println("To quit press 5")
	option = scala.io.StdIn.readInt()
	if (option == 1){
			hsbc.createAccount()
			}
	if (option == 2){
			print("Enter You Acount Number:")
			var Accountno=readInt
			hsbc.deposits(Accountno)
		}		
	if (option == 3){
			print("Enter You Acount Number:")
			var Accountno=readInt
			hsbc.withdraw(Accountno)
		}
	if (option == 4){
			print("Enter You Acount Number:")
			var Accountno=readInt
			hsbc.checkbalance(Accountno)
		}		
	if (option == 5){
			print("Thank you, goodbye")
			sys.exit(0)
		}
}
