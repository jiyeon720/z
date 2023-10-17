package kr.co.himedia.lambda05;
// 람다식 <T,E,R,U,X> 만들어서 사용하기 
@FunctionalInterface
public interface Function1<T,E,R,U>  {

	U apply(T t, E e, R r);
//	X apply(T t, E e, R r, U u);
}
