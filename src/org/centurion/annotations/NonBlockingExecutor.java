package org.centurion.annotations;

import java.lang.annotation.*;

/**
 * Indicates that the annotated executor (CoroutineContext, Scheduler)
 * does not allow blocking methods execution.
 *
 * <p>
 * If a given executor allows blocking calls, {@link BlockingExecutor} should be used.
 *
 * <p>
 * Example 1 (Kotlin coroutines):
 * <pre><code>
 *  class NonBlockingExampleService {
 *      val dispatcher: @NonBlockingExecutor CoroutineContext
 *          get() { ... }
 *
 *      suspend fun foo() {
 *          val result = withContext(dispatcher) {
 *              blockingBuzz() // IDE warning: `Possibly blocking call in non-blocking context`
 *          }
 *      }
 *
 *      &#064;Blocking fun blockingBuzz() { ... }
 *  }
 * </code></pre>
 *
 * <p>
 * Example 2 (Java with Reactor framework):
 * <pre><code>
 *  class NonBlockingExampleService {
 *      private static final @NonBlockingExecutor Scheduler operationsScheduler =
 *              Schedulers.newParallel("parallel");
 *
 *      public Flux&lt;String&gt; foo(Flux&lt;String&gt; urls) {
 *          return urls.publishOn(operationsScheduler)
 *                  .filter(url -&gt; blockingBuzz(url) != null);  // IDE warning: `Possibly blocking call in non-blocking context`
 *      }
 *
 *      &#064;Blocking
 *      private String blockingBuzz(String url) { ... }
 *  }
 * </code></pre>
 *  @see Blocking
 *  @see NonBlocking
 *
 * @author Logan Abernathy
 * @since CDK-Lib 1.0.0
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.TYPE_USE})
public @interface NonBlockingExecutor {
}
