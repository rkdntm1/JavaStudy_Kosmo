package annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * annotation : 클래스, 속성, 함수에 대한 메타 정보(주석)를 정의하도록 지원해주는 문법
 * ㄴ사용처 : 프레임워크이 annotation에 설정 정보를 읽어 나름의 공통적 기능을 제공한다.
 * 메타정보 : 클래스, 테이블, 속성 컬럼 함수 등등의 고유 정보. 
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface DisplayCaption {
	String caption();
}
