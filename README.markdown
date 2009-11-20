# JavaGems Example

### Setting up

If you have't already done so, you need to install the `javagems` ruby gem, which means you need to have ruby and RubyGems installed. Then, see the instructions on [JavaGems website](http://javagems.org). Once you've done that, all you need to do is:

    javagem bundle

To get a really cool effect, make sure the JUnit gem is not installed. `javagem` will make sure it's included form the vendor directory.

    javagem uninstall junit

### Compiling

    find src -name *.java | xargs jamc -cp src
    find test -name *.java | xargs jamc -cp src:test

I'm certain there are other ways, but I personally dislike Ant and I didn't want to turn everyone away by using a Rakefile. It's also just THIS easy to compile Java sometimes and `jamc` makes it even easier.

### Testing

    jam -cp src:test javagems.example.FooTest

## What's going on?

The important parts here are `javagem` and the `Gemfile`.

...
