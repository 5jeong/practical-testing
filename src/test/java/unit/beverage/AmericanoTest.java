package unit.beverage;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AmericanoTest {

    @DisplayName("아메리카노 이름 테스트")
    @Test
    void getName() {

        Americano americano = new Americano();
        assertThat(americano.getName()).isEqualTo("아메리카노");
    }

    @DisplayName("아메리카노 가격 테스트")
    @Test
    void getPrice (){
        Americano americano = new Americano();
        assertThat(americano.getPrice()).isEqualTo(4000);
     }
}