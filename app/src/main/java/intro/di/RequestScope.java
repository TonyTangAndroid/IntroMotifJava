package intro.di;

import intro.di.network.PriductService;

@motif.Scope
interface RequestScope {

  intro.di.network.PriductService priductService();

  //Profile

  @motif.Objects
  abstract class Objects {

    abstract PriductService PriductService();

  }
}