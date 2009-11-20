# JavaGems Example

### Setting up

    javagem bundle

To get a really cool effect, make sure the JUnit gem is not installed. `javagem` will make sure it's included form the vendor directory.

    javagem uninstall junit

### Compiling

    find src -name *.java | xargs jamc -cp src
    find test -name *.java | xargs jamc -cp src:test

### Testing

    jam -cp src:test javagems.example.FooTest

## What's going on?

The important parts here are `javagem` and the `Gemfile`.

...
