import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class ToBeTestedTest {

    @Mock
    Dependency dep;

    @InjectMocks
    ToBeTested underTest;

    @Test
    void helloTest() {
        given(dep.getSomething()).willReturn("123");

        String result = underTest.doSomething();

        assertThat(result, is("123"));
    }
}
