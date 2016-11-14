package net.aokv.railway.result.matchers;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;

import net.aokv.railway.result.Result;

public class IsFailure<T> extends TypeSafeDiagnosingMatcher<Result<T>>
{
	@Override
	public void describeTo(final Description description)
	{
		description.appendText("A failed Result");
	}

	@Override
	protected boolean matchesSafely(final Result<T> result, final Description description)
	{
		description.appendText("was ")
				.appendValue(result.toString());
		return result.isFailure();
	}
}