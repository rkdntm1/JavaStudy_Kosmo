package test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import model.Line;
import model.Point;
import model.Shape;

class TestBuilding {

	@Test
	void test() {
		try {
			Shape star = new Shape();
			//별모양 그림에 들어 있는 모든 점(5개)들을 대상으로 각 점에 달린 라인을 모아서 유일한 것만 추려내면 이또한 모두 5개야
			Set<Line> distinctLineSet = new HashSet<>();
			for (Point p : star.getListStarPoint()) {
				for (Line l : p.getListLine()) {
					distinctLineSet.add(l);
				}
			}
			//단언하다
			assert(distinctLineSet.size() == 5);
			
			/* list반환 람다에서 개별객체로 환원하기
			star.getListStarPoint().stream().map(p->{return p.getListLine();})
			.forEach(list->{list.forEach(line->{distinctLineSet.add(line);});
			});
			*/	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
