package com.shujie.coroutine

/**
 * Asynchronous timeout and resources
The timeout event in withTimeout is asynchronous with respect to the code running in
its block and may happen at any time, even right before the return from inside of the
timeout block. Keep this in mind if you open or acquire some resource inside the block
that needs closing or release outside of the block.
For example, here we imitate a closeable resource with the Resource class, that
simply keeps track of how many times it was created by incrementing the acquired
counter and decrementing this counter from its close function. Let us run a lot of
coroutines with the small timeout try acquire this resource from inside of the
withTimeout block after a bit of delay and release it from outside.
 * @author  linshujie
 */
class Sample8 {
}

