
//date class
#include <cstdlib>
#include "myDate.h"


myDate::myDate(int year , int month , int day )
	:y(year), m(month), d(day) {}

int myDate::getYear() const {
	return y;
}
int myDate::getDayOfMonth() const {
	return d;
}
int myDate::getMonth() const {
	return m;
}


void myDate::setDayOfMonth(int day) {
	d = day;
}
void myDate::setMonth(int month) {
	m = month;
}
void myDate::setYear(int year) {
	y = year;
}
void myDate::setDate(int year, int month, int day) {
	
	y = year;
	m = month;
	d = day;
}

bool myDate::isLeapYear() const {
	if (((y % 4 == 0) && (y % 100 != 0)) || ((y % 4 == 0) && (y % 400 == 0)))
		return 1;

	else
		return 0;
	
}
int myDate::getDayOfWeek() const {
	int A = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
	for (int j = 1; j<m; j++) {
		if ((j == 1) || (j == 3) || (j == 5) || (j == 7) || (j == 8) || (j == 10) || (j == 12)) {
			A += 31;
		}
		else if (j == 2) {
			if (((y % 4 == 0) && (y % 100 != 0)) || ((y % 4 == 0) && (y % 400 == 0))) {
				A += 29;
			}            //leap year
			else {
				A += 28;
			}
		}           //general year
		else {
			A += 30;
		}

	}
	if ((A + d - 1) % 7 == 0) {               //monday
		return  1;
	}

	else if ((A + d - 1) % 7 == 1) {
		return 2;
	}

	else if ((A + d - 1) % 7 == 2) {
		return 3;
	}

	else if ((A + d - 1) % 7 == 3) {
		return 4;
	}

	else if ((A + d - 1) % 7 == 4) {
		return 5;
	}

	else if ((A + d - 1) % 7 == 5) {
		return 6;
	}
	else
		return 0;
}
