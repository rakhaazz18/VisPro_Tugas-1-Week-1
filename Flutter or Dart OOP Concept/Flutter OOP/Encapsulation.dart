class BankAccount {
	double _balance = 0;

	void deposit(double amount) {
		_balance += amount;
	}

	double get balance => _balance;
}

void main() {
	BankAccount account = BankAccount();
	account.deposit(100);
	print('Balance: [32m${account.balance}[0m');
}

