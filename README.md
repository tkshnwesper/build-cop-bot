# build-cop-bot

Publishes build fail notifications from GoCD to Google Chat using Webhook API.

## Getting it up and running

### Create a configuration file

Create a file called `resources/config.edn` which consists of the following data:

```edn
{:gocd_token "gocd token"
 :chat_webhook_url "google chat webhook url"}
```

## Running tests

```sh
lein test
```

## License

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
