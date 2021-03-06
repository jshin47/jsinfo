<<<<<<< HEAD
# Protobox #

Protobox is a layer on top of [vagrant](http://vagrantup.com) and a [web GUI](http://getprotobox.com/about) to setup virtual machines for web development. A single [YAML document](https://github.com/protobox/protobox/blob/master/data/config/common.yml-dist) controls everything that is installed on the virtual machine. You can install [popular languages](https://github.com/protobox/protobox-docs/blob/master/modules.md#languages), [software](https://github.com/protobox/protobox-docs/blob/master/modules.md), and even [popular web applications](https://github.com/protobox/protobox-docs/blob/master/applications.md) or your [own private GIT repositories](#applications) with a simple on/off toggle in YAML. You can read more about why this was developed in our [about document](https://github.com/protobox/protobox-docs/blob/master/about.md) or on our website at [getprotobox.com](http://getprotobox.com/docs/about). 

## Installation ##

Open terminal and run the following:

	gem install protobox && protobox init

Then run `vagrant up` and follow the protobox instructions on screen.

Protobox can also be installed other ways, [click here to check out alternative installation options](http://getprotobox.com/docs/installation).

## Configuration ##

The protobox configuration file is found at `data/config/common.yml`. You can easily install new services by setting `install: 1` under any of the software in the configuration file. Alternatively you can drag and drop your yml file to make changes with our web gui at [getprotobox.com](http://getprotobox.com). 

## Functionality ##

Protobox has built in support for the following functionality:

- **Vast Module Selection**: Protobox comes bundled with 15+ of the most common modules that PHP developer use everyday.
- **Application Installing**: Set the path to a git repo (public or private) or a composer project and upon vagrant up it will be installed for you. 
- **User Preferences**: Upon boot up your dot files in data/dot will be copied to the virtual machine.
- **SSH Keys**: Place your ssh keys in the data/ssh and reference them from the configuration file to be copied to the virtual machine to easily access any remote servers or github. 
- **SQL Import**: You can add any sql files in data/sql and reference them in the configuration file to be imported upon the bootup of the virtual machine. 
- **Mailcatching**: The mailcatcher package can catch any mail leaving the system for debugging and testing. 
- **Ansible**: Protobox is built using [ansible](http://www.ansibleworks.com/). It's simplicity, yaml format, and agent operation make for a very powerful combination. [Why Ansible?](http://www.ansibleworks.com/why-ansible/).

## Modules ##

Protobox has built in support for any OS, common web servers, and languages. See the full list by reading the [modules document](https://github.com/protobox/protobox-docs/blob/master/modules.md) or on our website at [getprotobox.com](http://getprotobox.com/docs/modules). 

## Applications ##

Protobox has built in support for popular applications. See the full list by reading the [applications document](https://github.com/protobox/protobox-docs/blob/master/applications.md) or on our website at [getprotobox.com](http://getprotobox.com/docs/applications). 

## Contributing ##

Check out our [roadmap](http://getprotobox.com/docs/roadmap) for upcoming features and how to help.

Use [GitHub Issues](https://github.com/protobox/protobox/issues) to file a bug report or new feature request. Please open a issue prior to opening a pull request to make sure it is something we can merge. The roadmap can be determined by looking at issues tagged as `featured request`.

## Help! ##

Use [GitHub Issues](https://github.com/protobox/protobox/issues) or #protobox on irc.freenode.net.

## Credit ##

Protobox was developed by [Patrick Heeney](https://github.com/patrickheeney) and inspired by the [puphpet](https://github.com/puphpet/puphpet) project. A special thanks goes out to our [contributors](https://github.com/protobox/protobox/graphs/contributors) for helping grow this project. Protobox is also made possible by the best orchestration engine in existence: [ansible](http://www.ansibleworks.com/).

## License ##

Protobox is licensed under the [MIT license](http://opensource.org/licenses/mit-license.php).
=======
react-sticky [![Build Status](https://travis-ci.org/captivationsoftware/react-sticky.svg?branch=master)](https://travis-ci.org/captivationsoftware/react-sticky)
============
The most powerful Sticky library available for React!

#### Captivation Software is hiring ES6/React developers!
- Must be located in the Baltimore, MD/Washington, DC area
- If interested, send your resume and/or a link to your github profile to jobs@captivationsoftware.com

#### Demos
  - [Basic](http://rawgit.com/captivationsoftware/react-sticky/master/examples/basic/index.html)
  - [Timeline](http://rawgit.com/captivationsoftware/react-sticky/master/examples/timeline/index.html)

#### Highlights
  - Fully-nestable, allowing you to build awesome layouts with familiar syntax
  - Sane defaults so you spend less time configuring
  - Allows multiple Sticky elements on the page at once with compositional awareness!

## Installation
```sh
npm install react-sticky
```

Tip: run `npm build` to build the compressed UMD version suitable for inclusion via CommonJS, AMD, and even good old fashioned `<script>` tags (available as `ReactSticky`).

## Overview & Basic Example

It all starts with a `<StickyContainer />`. This is basically a plain ol' `<div />` with a React-managed `padding-top` css attribute. As you scroll down the page, all `<Sticky />` tags within
will be constrained to the bounds of its closest `<StickyContainer />` parent.

The elements you actually want to "stick" should be wrapped in the `<Sticky />` tag. The full list of props are available below, but typical usage will look something like so:

app.jsx
```js
import React from 'react';
import { StickyContainer, Sticky } from 'react-sticky';
...

class App extends React.Component ({
  render() {
    return (
      ...
      <StickyContainer>
        ...
        <Sticky>
          <header>
            ...
          </header>
        </Sticky>
        ...
      </StickyContainer>
      ...
    );
  },
});

```

When the "stickiness" becomes activated, the following inline style rules are applied to the Sticky element:

```css
  position: fixed;
  top: 0;
  left: 0;
  width: < width is inherited from the closest StickyContainer >
```
Note that the calculation of the Sticky element's height does not currently take margins into account. If you have margins on this element it may result in unexpected behavior.

### `<StickyContainer />` Props

`<StickyContainer />` passes along all props you provide to it without interference. That's right - no restrictions - go nuts!  

### `<Sticky />` Props

#### stickyStyle _(default: {})_
In the event that you wish to override the style rules applied, simply pass in the style object as a prop:

app.jsx
```js
<StickyContainer>
  <Sticky stickyStyle={customStyleObject}>
    <header />
  </Sticky>
</StickyContainer>
```

Note: You likely want to avoid messing with the following attributes in your stickyStyle: `left`, `top`, and `width`.

#### stickyClassName _(default: 'sticky')_
You can also specify a class name to be applied when the element becomes sticky:

app.jsx
```js
<StickyContainer>
  ...
  <Sticky stickyClassName={customClassName}>
    <header />
  </Sticky>
  ...
</StickyContainer>
```

#### topOffset _(default: 0)_
Sticky state will be triggered when the top of the element is `topOffset` pixels from the top of the closest `<StickyContainer />`. Positive numbers give the impression of a lazy sticky state, whereas negative numbers are more eager in their attachment.

app.jsx
```js
<StickyContainer>
  ...
  <Sticky topOffset={80}>
    <SomeChild />
  </Sticky>
  ...
</StickyContainer>
```

The above would result in an element that becomes sticky once its top is greater than or equal to 80px away from the top of the `<StickyContainer />`.


#### bottomOffset _(default: 0)_
Sticky state will be triggered when the bottom of the element is `bottomOffset` pixels from the bottom of the closest `<StickyContainer />`.

app.jsx
```js
<StickyContainer>
  ...
  <Sticky bottomOffset={80}>
    <SomeChild />
  </Sticky>
  ...
</StickyContainer>
```


#### className _(default: '')_
You can specify a class name that would be applied to the resulting element:

app.jsx
```js
<StickyContainer>
  ...
  <Sticky className={className}>
    <header />
  </Sticky>
  ...
</StickyContainer>
```

#### style _(default: {})_
You can also specify a style object that would be applied to the resulting element:

app.jsx
```js
<StickyContainer>
  ...
  <Sticky style={{background: 'red'}}>
    <header />
  </Sticky>
</StickyContainer>
```

Note: In the event that `stickyStyle` rules conflict with `style` rules, `stickyStyle` rules take precedence ONLY while sticky state is active.

#### onStickyStateChange _(default: function() {})_

Use the onStickyStateChange prop to fire a callback function when the sticky state changes:

app.jsx
```js
<StickyContainer>
  ...
  <Sticky onStickyStateChange={this.handleStickyStateChange}>
    <header />
  </Sticky
  ...
</StickyContainer>
```

#### isActive _(default: true)_

Use the isActive prop to manually turn sticky on or off:

app.jsx
```js
<StickyContainer>
  ...
  <Sticky isActive={false}>
    <header />
  </Sticky
  ...
</StickyContainer>
```

### License
MIT
>>>>>>> b680b4e3a76990ae0c78461a8f5b97e07c89a7db
