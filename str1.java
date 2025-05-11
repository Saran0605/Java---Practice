import java.util.*;
class str1{
public static void main(String args[]){
String st = "During Operation Titanic, they were used to provide a decoy to cover the real D-Day landings.  In the early hours of the morning of 6 June 1944, a force of 40 aircraft dropped 500 dummies in four separate locations along the French coastal interior.   Radar chaff, rifle fire simulators and two teams of Special Air Service soldiers carrying recordings of loud battle noise were also dropped to reinforce the deception and divert German troops  away from the Allies actual drop zones.  Two aircraft were lost in the operation and of the six SAS soldiers involved, only two eventually reached safety.  The others were captured and remained in German POW camps until the end of the war.";
System.out.println(st);
long count = Arrays.stream(st.split("\\s+")).count();
System.out.println(count);
}
}
