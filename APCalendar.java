/* A1 */

public class APCalendar
{
  /** Returns true if year is a leap year and false otherwise. */
  private static boolean isLeapYear(int year)
  {
    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
  }

  /******************************** Part (a) ********************************/

  /** Returns the number of leap years between year1 and year2, inclusive.
   * Precondition: 0 <= year1 <= year2
   */
  public static int numberOfLeapYears(int year1, int year2)
  { 
    int count = 0;
    int difference = year2 - year1;
    for (int i = 0; i <= difference; i++)
    {
		if (isLeapYear(year1 + i))
		{
			count++;
		}
	}
    return count;
  }
  
  /** Returns the value representing the day of the week for the first day of year,
   *  where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
   */
  private static int firstDayOfYear(int year)
  {
    /* January 1, 1980 was a Tuesday */
      return (2 + 365*(year - 1980) + numberOfLeapYears(1980, year-1)) % 7;
  }

  /** Returns n, where month, day, and year specify the nth day of the year.
   *  Returns 1 for January 1 (month = 1, day = 1) of any year.
   *  Precondition: The date represented by month, day, year is a valid date.
   */
  private static int dayOfYear(int month, int day, int year)
  {
    final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    int n = day;
    int mth  = 1;
    
    while (mth < month)
    {
      n += daysInMonth[mth - 1];
      mth++;
    }
    
    if (mth > 2 && isLeapYear(year))
      n++;
    
    return n;
  }
  
  /******************************** Part (b) ********************************/
  
  /** Returns the value representing the day of the week for the given date
   *  (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
   *  and 6 denotes Saturday.
   *  Precondition: The date represented by month, day, year is a valid date.
   */
public static int dayOfWeek(int month, int day, int year)
{
    int tracker = firstDayOfYear(year);
    int dayNum = dayOfYear(month, day, year);
    for (int i = 1; i < dayNum; i++) 
    {
        if (tracker == 6)
        {
            tracker = 0;
        }
        else
        {
            tracker++;
        }
    }
    return tracker;
}
}
