float inquad (float t)
{
  return pow(t, 2);
}

float outquad (float t)
{
  return 1 - inquad(t);
}

float inoutquad (float t)
{
  return t < 0.5 ? 2 * pow(t, 2) : -1 + (4 - 2  * t) * t;
}

float incubic (float t)
{
  return pow(t, 3);
}

float outcubic (float t)
{
  return 1 - incubic(t);
}

float inoutcubic (float t)
{
  return t < 0.5 ? 4 * pow(t, 3) : (t - 1) * pow(2 * t - 2, 2) + 1;
}

float inquart (float t)
{
  return pow(t, 4);
}

float outquart (float t)
{
  return 1 - inquart(t);
}

float inoutquart (float t)
{
  return t < 0.5 ? 8 * pow(t, 4) : 1 - 8 * (--t) * pow(t, 3);
}

float inquint(float t)
{
  return pow(t, 5);
}

float outquint(float t)
{
  return 1 - inquint(t);
}

float inoutquint(float t)
{
  return t<.5 ? 16 * pow(t, 5) : 1 + 16 * (--t) * pow(t, 4);
}

float inexpo(float t)
{
  return pow(2, 10 * (t - 1));
}

float outexpo(float t)
{
  return -pow(2, -10 * t) + 1;
}
