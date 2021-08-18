package foodOrder;

public class FoodOrderTest {

	public static void main(String[] args) {
FoodOrder order1 = new FoodOrder(20201102003L,"서울시 강남구 역삼동 111-333",2020102,130258,35000,0003);
System.out.println(order1.toString());

//생성자안에 int 크기가 넘는 수를 어찌 넣을것인가?
//=> long 숫자L
}

}
